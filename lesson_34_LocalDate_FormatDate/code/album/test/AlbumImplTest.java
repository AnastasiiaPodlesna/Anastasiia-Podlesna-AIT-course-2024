package album.test;

import album.dao.Album;
import album.dao.AlbumImpl;
import album.model.Photo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest
{
    Album album;
    Photo[] photos;

    LocalDateTime now = LocalDateTime.now();

    // Comparator который сортирует по Id альбома, потом по Id фото
    Comparator<Photo> comparator = (p1, p2) ->
    {
        int res = Integer.compare(p1.getAlbumId(), p2.getAlbumId()); // отсортировали по альбому
        return res !=0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId());
    };


    @BeforeEach
    void setUp()
    {
        album = new AlbumImpl(6);
        photos = new Photo[6];
        photos[0] = new Photo(1, 1, "t1", "url1", now.minusDays(10));// 10 дней назад
        photos[1] = new Photo(1, 2, "t2", "url2", now.minusDays(7));
        photos[2] = new Photo(1, 3, "t3", "url3", now.minusDays(5));
        photos[3] = new Photo(2, 2, "t4", "url4", now.minusDays(7));
        photos[4] = new Photo(2, 1, "t5", "url5", now.minusDays(5));
        photos[5] = new Photo(1, 1, "t6", "url6", now.minusDays(2));

        for (int i = 0; i < photos.length; i++)
        {
            album.addPhoto(photos[i]);
        }

    }

    @Test
    void addPhoto()
    {
        assertFalse(album.addPhoto(null));
        assertFalse(album.addPhoto(photos[1]));
        Photo photo = new Photo(3,4, "t9", "url9", now.minusDays(5));
        assertTrue(album.addPhoto(photo));
        photo = new Photo(2, 4, "t8", "url8", now.minusDays(2));
        assertFalse(album.addPhoto(photo));
        printPhotos(photos);
    }

    @Test
    void removePhoto()
    {
        assertTrue(album.removePhoto(1, 1));
        assertFalse(album.removePhoto(3, 1));
        assertEquals(4, album.size());
    }

    @Test
    void updatePhoto()
    {
        assertTrue(album.updatePhoto(1, 1, "newUrl"));
        assertEquals("newUrl", album.getPhotoFromAlbum(1, 1).getUrl());
    }

    @Test
    void getPhotoFromAlbum()
    {
        assertEquals(photos[1], album.getPhotoFromAlbum(1, 2));
        assertNull(album.getPhotoFromAlbum(5, 4));
    }

    @Test
    void getAllPhotoFromAlbum()
    {
        assertArrayEquals(new Photo[]{photos[4], photos[3]}, album.getAllPhotoFromAlbum(2));
    }

    @Test
    void getPhotoBetweenDate()
    {
        // диапазон дат
        LocalDate dateFrom = now.toLocalDate().minusDays(10);
        LocalDate dateTo = now.toLocalDate().minusDays(7);

        Photo[] actual = album.getPhotoBetweenDate(dateFrom, dateTo);

        Arrays.sort(actual, comparator);
        Photo[] expected = {photos[0], photos[1], photos[3]};
        Arrays.sort(expected, comparator);

        assertArrayEquals(expected, actual);
        printPhotos(actual);
    }

    @Test
    void size()
    {
        assertEquals(5, album.size());
    }

    private void printPhotos(Photo[] photos)
    {
        for (Photo p : photos)
        System.out.println(p);
    }
}