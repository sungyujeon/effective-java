package com.effectiveJava.chapter01.item07.cache;

import java.util.Map;
import java.util.WeakHashMap;

public class PostRepository {

    private Map<CacheKey, Post> cache;

    public PostRepository() {
        this.cache = new WeakHashMap<>();
    }

    public Post getPostById(Integer id) {
        CacheKey key = new CacheKey(id);

        if (cache.containsKey(key)) {
            return cache.get(key);
        } else {
            // TODO DB에서 읽어오거나 REST API를 통해 읽어옴
            Post post = new Post();
            cache.put(key, post);
            return post;
        }
    }

    public Map<CacheKey, Post> getCache() {
        return cache;
    }
}
