package hello;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by agup101 on 4/20/2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String lastName;
    private String firstName;

}
