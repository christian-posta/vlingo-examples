package io.examples.stock.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class ItemId {

    @Column(name = "ITEM_ID")
    private final long id;

    public ItemId() {
        this(0);
    }

    private ItemId(final long id) {
        this.id = id;
    }

    public static ItemId of(final long id) {
        return new ItemId(id);
    }

    public long id() {
        return id;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final ItemId itemId = (ItemId) o;
        return this.id == itemId.id();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ItemId{" +
                "id=" + id +
                '}';
    }
}
