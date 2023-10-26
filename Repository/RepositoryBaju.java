package Repository;

import Entity.ClothingCatalogue_036;
import java.util.ArrayList;

public interface RepositoryBaju {
    public ArrayList<ClothingCatalogue_036> getAll();
    public void add(ClothingCatalogue_036 clothingCatalogue_036 );
    public void sell(ClothingCatalogue_036 clothingCatalogue_036);

}
