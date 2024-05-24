package org.hieunguyen.simplefactory;

/**
 * This class acts as a simple factory for creation of
 * different posts on web site.
 */
public class PostFactory {
    public static Post createPost(String type) {
        switch (type) {
            case "news":
                return new NewsPost();
            case "blog":
                return new BlogPost();
            case "product":
                return new ProductPost();
            default:
                return null;
        }
    }
}
