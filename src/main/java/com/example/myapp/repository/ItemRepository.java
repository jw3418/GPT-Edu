package com.example.myapp.repository;

import com.example.myapp.model.Item;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemRepository {
    private final List<Item> items = new ArrayList<>();

}
