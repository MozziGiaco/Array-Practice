
public class ArrayPractice
	{

		public static void main(String[] args)
			{
				String[] poloColor = new String[5];

				poloColor[0] = "Gray";
				poloColor[1] = "Navy Blue";
				poloColor[2] = "Yellow";
				poloColor[3] = "Light Blue";
				poloColor[4] = "White";

				System.out.println("Your polo color choices are:");
				for (String p : poloColor)
					{
						System.out.println(p);
					}

				int randomNumber = (int) (Math.random() * poloColor.length);

				System.out.println("You should wear the color " + poloColor[randomNumber] + " today!");

			}

	}
