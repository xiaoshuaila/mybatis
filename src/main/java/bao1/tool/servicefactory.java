package bao1.tool;

public class servicefactory {
    public static Object getservice(Object service){
        return new handler(service).getprox();
    }
}
