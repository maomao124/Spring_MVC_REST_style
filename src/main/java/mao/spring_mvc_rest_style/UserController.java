package mao.spring_mvc_rest_style;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Project name(项目名称)：Spring_MVC_REST_style
 * Package(包名): mao.spring_mvc_rest_style
 * Class(类名): UserController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/10
 * Time(创建时间)： 21:54
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Controller
public class UserController
{
    @RequestMapping("/rest")
    public String rest()
    {
        return "rest";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String hello(@PathVariable Integer id)
    {
        System.out.println("test rest get:" + id);
        return "/success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.POST)
    public String hello1(@PathVariable Integer id)
    {
        System.out.println("test POST:"+id);
        return "/success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public String helloDelete(@PathVariable Integer id)
    {
        System.out.println("test rest delete:" + id);
        return "/success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public String helloPUt(@PathVariable Integer id)
    {
        System.out.println("test rest put:" + id);
        return "/success";
    }
}
