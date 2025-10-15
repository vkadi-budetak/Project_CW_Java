import java.util.List;
// Интерфейс для тех, кто может готовить
public interface Cookable {
    void cook(String dish);
    List<String> getFavoriteRecipes();
}
