package album.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Photo implements Comparable<Photo>
{
    private int albumId;
    private int photoId;
    private String title;
    private String url;
    private LocalDateTime date;

    public Photo(int albumId,int photoId, String title, String url, LocalDateTime date) {
        this.albumId = albumId;
        this.photoId = photoId;
        this.title = title;
        this.url = url;
        this.date = date;
    }

    public int getAlbumId()
    {
        return albumId;
    }

    public int getPhotoId()
    {
        return photoId;
    }

    public String getTitle()
    {
        return title;
    }

    public String getUrl()
    {
        return url;
    }

    public LocalDateTime getDate()
    {
        return date;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Photo fhoto)) return false;
        return albumId == fhoto.albumId && photoId == fhoto.photoId;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(albumId, photoId);
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("album.model.Fhoto{");
        sb.append("albumId=").append(albumId);
        sb.append(", photoId=").append(photoId);
        sb.append(", title='").append(title).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Photo o)
    {
        return this.getDate().compareTo(o.getDate());
    }
}
