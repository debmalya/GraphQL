package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

public class Mutation implements GraphQLRootResolver{

    private final LinkRepository linkRepository;

    public Mutation(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    /**
     *  This method will act as the resolver function for the createLink mutation,
     *  takes arguments of the name and type analogous to those defined in the mutation itself.
     *
     * type Mutation {
     *     createLink(url: String!, description: String!): Link
     * }
     *
     * @param url of the link.
     * @param description description of the link.
     * @return reference of the link.
     */
    public Link createLink(String url, String description) {
        Link newLink = new Link(url, description);
        linkRepository.saveLink(newLink);
        return newLink;
    }
}
