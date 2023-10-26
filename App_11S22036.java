import Repository.RepositoryBaju;
import Repository.RepositoryBajuImpl;
import Service.ServiceBaju;
import Service.ServiceBajuImpl;
import View.MyClothView;

public class App_11S22036 {
    public static void main(String[] args) {
        RepositoryBaju repositoryBaju = new RepositoryBajuImpl();
        ServiceBaju serviceBaju = new ServiceBajuImpl(repositoryBaju);
        MyClothView myClothView = new MyClothView(serviceBaju);

        myClothView.ShowMyCloth();
    }
}
