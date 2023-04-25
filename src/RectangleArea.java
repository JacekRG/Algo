public class RectangleArea {

    public static int RectangleArea(String[] strArr) {

        int maxHor = Integer.MIN_VALUE;
        int minHor = Integer.MAX_VALUE;
        int maxVert = Integer.MIN_VALUE;
        int minVert = Integer.MAX_VALUE;

        for(int i = 0; i < 4; i++){

            String[] points = strArr[i].split(" ");
            String firstPoint = points[0].substring(1);
            String secondPoint = points[1].substring(0,points[1].length()-1);

            if(Integer.parseInt(firstPoint) > maxHor){
                maxHor = Integer.parseInt(firstPoint);
            }
            if(Integer.parseInt(firstPoint) < minHor){
                minHor = Integer.parseInt(firstPoint);
            }
            if(Integer.parseInt(secondPoint) > maxVert){
                maxVert = Integer.parseInt(secondPoint);
            }
            if(Integer.parseInt(secondPoint) < minVert){
                minVert = Integer.parseInt(secondPoint);
            }
        }
        return (maxHor-minHor)*(maxVert-minVert);
    }
}
