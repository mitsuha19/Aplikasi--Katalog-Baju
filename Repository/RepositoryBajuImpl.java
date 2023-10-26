package Repository;

import java.util.ArrayList;

import Entity.ClothingCatalogue_036;

public class RepositoryBajuImpl implements RepositoryBaju {

    ArrayList<ClothingCatalogue_036> data = new ArrayList<ClothingCatalogue_036>();

    @Override
    public ArrayList<ClothingCatalogue_036> getAll() {
        return data;
    }

    @Override
    public void add(ClothingCatalogue_036 clothingCatalogue_036 ) {
        data.add(clothingCatalogue_036);
    }

    @Override
    public void sell(ClothingCatalogue_036 clothingCatalogue_036) {
        
    }
}
