package b6;

import java.util.List;

public class Main {
    record Post(List<String> tag){}

    public static void main(String[] args) {
        Post p1 = new Post(List.of("java", "backend"));
        Post p2 = new Post(List.of("python", "data"));

        List<Post> posts = List.of(p1, p2);

        posts.stream()
                .flatMap(p -> p.tag().stream())
                .forEach(System.out::println);
    }
}
