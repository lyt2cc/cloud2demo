package lyt.com.web;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class GetnController {
    @RequestMapping("/hello")
    String getn()
    {
        return "{\n" +
                "\"id\": 8,\n" +
                "\"userName\": \"liuyan\",\n" +
                "\"password\": \"123456\",\n" +
                "\"name\": \"柳岩\",\n" +
                "\"age\": 21,\n" +
                "\"sex\": 2,\n" +
                "\"birthday\": \"1995-08-07T16:00:00.000+0000\",\n" +
                "\"created\": \"2014-09-20T03:41:15.000+0000\",\n" +
                "\"updated\": \"2014-09-20T03:41:15.000+0000\",\n" +
                "\"note\": \"柳岩同学在雅橙学表演\"\n" +
                "}";
    }

}
