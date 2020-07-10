package domain;
import jdk.nashorn.internal.objects.annotations.Getter;

import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;

@Entity
@Table(name = "book")
@Getter
public class Book {
    @Version
    private Long version;

    @Column(name = "ISBN", nullable = false)
    private int isbn;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "author", nullable = false)
    private String autor;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
