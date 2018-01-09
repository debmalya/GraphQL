package com.howtographql.hackernews;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages link persistence
 */
public class LinkRepository {

    private final List<Link> links;

    public LinkRepository() {
        links = new ArrayList<>();
        //add some links to start off with
        links.add(new Link("http://howtographql.com", "Your favorite GraphQL page"));
        links.add(new Link("http://graphql.org/learn/", "The official docks"));
        links.add(new Link("http://www.futurelearn.com", "Future learn"));
        links.add(new Link("http://www.udemy.com", "Udemy"));
        links.add(new Link("http://java.sun.com", "Java Official Website"));
    }

    public List<Link> getAllLinks() {
        return links;
    }

    public void saveLink(Link link) {
        links.add(link);
    }
}