public class ModelStore implements IModelChanger {

    public PoligonalModel models = new PoligonalModel();
    public Scene scenes = new Scene();
    public Flash flashes = new Flash();
    public Camera cameras = new Camera();

    public Scene getScene(int i){

        Scene scenOne = new Scene();
        return scenOne;

    }

    public void NotifyChange(IModelChanger IMC){

    }

}


