package gsmclass;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

class Car
{
    private String model;
    public Car(String model)
    {
        this.model = model;
    }
    
    @Override
    public String toString() { // getter
        
        return this.model;
        
    }

    @Override
  public boolean equals(Object obj) {

      Car car = (Car)obj;
      return (this.model == car.model );

  }
    
}


public class ApiTest {

    public static void main(String[] args) {

        SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
        Date d = new Date();
        Car myCar = new Car("�׷���");
        Car yourCar = new Car("�׷���");
        String str = MessageFormat.format("��¥: {0}, �ڵ��� ��  = [{1}], ������ (ȫ�浿)"
                , s.format(d), myCar);
        StringTokenizer st = new StringTokenizer(str, "[|]|,|(|) |="); 
        if(myCar.equals(yourCar)) 
        {
            System.out.println("�ڵ��� ���� �� �� "+myCar+"�� �����ϴ�");
        } 
        else 
        {
            System.out.println("��"+myCar+", ��"+yourCar+"�� ���� �ٸ���.");
        }
        
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
        
        
        
    }

}
