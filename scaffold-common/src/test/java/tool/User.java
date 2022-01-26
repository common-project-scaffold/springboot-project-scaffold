package tool;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * Project: springboot-project-scaffold
 * Package: tool
 * Title: User
 * Description: User
 * </p>
 *
 * @author liguodong
 * @version 1.0.0
 * @date 2022/1/26
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private String name;

    private Integer age;

}
