package guru.qa.lombok;

import lombok.Data;

@Data
public class LoginResponseLombokModel {

    private String name, job, token, error, email, password, updatedAt, id, createdAt;

}
