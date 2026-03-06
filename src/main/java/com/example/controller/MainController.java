package com.example.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController// it exposes data and service in the form of JSON/XML
public class MainController {

    List<String> list=new ArrayList<>();
    public MainController()
    {
        list.add("Iha");
        list.add("Virat");
        list.add("Riya");
        list.add("Tiya");
    }
    //@RequestMapping("/list")
    //@RequestMapping(value="/list", method=RequestMethod.GET)
    @GetMapping("/list")
    public List<String> show()
    {
        return list;
    }
    @PostMapping("/add")
    public void add(@RequestBody String name)
    {
        //list.add("Surya");
        list.add(name);
    }
    @PutMapping("/update")
    public void update(@PathVariable int index,@RequestBody String name)
    {

        list.set(index,"iha");
    }
    @DeleteMapping("/deleteName/{index}")
    public void delete(@PathVariable int index)
    {
        list.remove(index);
    }
    @GetMapping("/findOne/{index}")
    public String findOne(@PathVariable int index)
    {
        return list.get(index);
    }
}
