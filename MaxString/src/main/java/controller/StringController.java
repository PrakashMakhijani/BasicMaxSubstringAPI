package controller;


import com.example.maxstring.model.MyStrings;
import com.example.maxstring.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StringController {

    @Autowired
   StringService stringService;

    public StringController(StringService stringService) {
        this.stringService = stringService;
    }

    @RequestMapping("/{string1}/{string2}")
    public int getMaxSubString(@PathVariable("string1")String st1, @PathVariable("string2")String st2){


        return stringService.getMaxSubstringfrom(st1.toCharArray(),st2.toCharArray(),st1.length(),st2.length());


    }
}
