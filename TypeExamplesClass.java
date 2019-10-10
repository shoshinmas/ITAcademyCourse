public class TypeExamplesClass {

	public static void main(String[] args) {

int age = 40;
String message = null;

if (age >= 25) {

message = "Ma wiecej niz 25 lat";

}
else if (age <20)
{
message = "Ma mniej niz 20 lat";
}
else if (age>25 && age<40) 
{
	message = "Forever young";
}

System.out.println(message);
}
}