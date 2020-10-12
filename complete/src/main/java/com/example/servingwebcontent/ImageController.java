package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class ImageController {

    private final static Logger LOGGER = Logger.getLogger(ImageController.class.getName());
    @GetMapping("/image")
    public String image(
            @RequestHeader("my-number") String myNumber1,
            @RequestHeader("my-number") String myNumber2,
            @RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {

        model.addAttribute("image", name);
        LOGGER.setLevel(Level.INFO);
        LOGGER.info("Called image controller with :" + name);


        return "image";
    }

}
