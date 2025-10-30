package mg.edu.post.items;

public record Book(Cover cover) {
    public Enum<Cover> getCover() {
        return cover;
    }
}
