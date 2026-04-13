package com.greeningindia.backend.controller;

import com.greeningindia.backend.model.Tree;
import com.greeningindia.backend.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trees")
public class TreeController {

    @Autowired
    private TreeService service;

    @PostMapping
    public Tree saveTree(@RequestBody Tree tree) {
        return service.saveTree(tree);
    }

    @GetMapping
    public List<Tree> getAllTrees() {
        return service.getAllTrees();
    }

   
    @GetMapping("/{id}")
    public Tree getTreeById(@PathVariable Long id) {
        return service.getTreeById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteTree(@PathVariable Long id) {
        service.deleteTree(id);
        return "Tree deleted successfully";
    }

    @PutMapping("/{id}")
    public Tree updateTree(@PathVariable Long id, @RequestBody Tree tree) {
        return service.updateTree(id, tree);
    }
}