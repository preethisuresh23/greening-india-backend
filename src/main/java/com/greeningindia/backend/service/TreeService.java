package com.greeningindia.backend.service;

import com.greeningindia.backend.model.Tree;
import com.greeningindia.backend.repository.TreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeService {

    @Autowired
    private TreeRepository repo;

    public Tree saveTree(Tree tree) {
        return repo.save(tree);
    }

    public List<Tree> getAllTrees() {
        return repo.findAll();
    }

    public Tree getTreeById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteTree(Long id) {
        repo.deleteById(id);
    }

    public Tree updateTree(Long id, Tree newTree) {
        Tree tree = repo.findById(id).orElse(null);

        if (tree != null) {
            tree.setLocation(newTree.getLocation());
            tree.setPlantedBy(newTree.getPlantedBy());
            tree.setCarbonSaved(newTree.getCarbonSaved());
            return repo.save(tree);
        }

        return null;
    }
}