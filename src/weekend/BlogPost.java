package weekend;

public class BlogPost {
    String title;
    String author;
    BlogPostType type;
    int likes;
}
enum BlogPostType {
    NEWS,
    REVIEW,
    GUIDE
}
class Tuple {
    BlogPostType type;
    String author;
}
