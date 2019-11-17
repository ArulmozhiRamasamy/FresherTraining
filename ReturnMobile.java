public class ReturnMobile {
private int Id;
private String Mobilename;
private String Name;

public String getName() {
return Name;
}
public void setName(String name) {
Name = name;
}
public int getId() {
return Id;
}
public void setId(int id) {
Id = id;
}
public String getMobilename() {
return Mobilename;
}
public void setMobilename(String mobilename) {
Mobilename = mobilename;
}
@Override
public String toString() {
return "" + Id + "        " + Mobilename + "";
}




}




