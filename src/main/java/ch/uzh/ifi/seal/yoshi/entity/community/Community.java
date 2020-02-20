package ch.uzh.ifi.seal.yoshi.entity.community;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Community implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    public Community(Long id) {
        // Empty constructor needed for database purposes
    }

}
