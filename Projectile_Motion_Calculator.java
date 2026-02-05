import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class Projectile_Motion_Calculator extends JFrame {

	private JTextField velocityText;
	private JTextField angleText;

	public Projectile_Motion_Calculator() {

		super("Projectile Motion Calculator");

		initilizeGUI();
	}

	private void initilizeGUI() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(300, 300);

		setLocationRelativeTo(null);

		JPanel mainPanel = new JPanel(new GridLayout(3, 2, 10, 10));

		mainPanel.setBackground(new Color(40, 40, 40));

		javax.swing.border.TitledBorder border = BorderFactory.createTitledBorder("User Input");
		border.setTitleColor(Color.WHITE);
		mainPanel.setBorder(border);

		JLabel velocityLabel = new JLabel("Enter Velocity:", SwingConstants.RIGHT);
		velocityLabel.setForeground(Color.WHITE);
		mainPanel.add(velocityLabel);

		velocityText = new JTextField();
		velocityText.setBackground(Color.LIGHT_GRAY);
		mainPanel.add(velocityText);
		//

		JLabel angleLabel = new JLabel("Enter Angle:", SwingConstants.RIGHT);
		angleLabel.setForeground(Color.WHITE);
		mainPanel.add(angleLabel);

		angleText = new JTextField();
		angleText.setBackground(Color.LIGHT_GRAY);
		mainPanel.add(angleText);

		mainPanel.add(new JLabel(""));

		JButton computeBtn = new JButton("Compute");
		computeBtn.setBackground(new Color(70, 130, 180));
		computeBtn.setForeground(Color.WHITE);
		computeBtn.setFocusPainted(false);
		computeBtn.addActionListener(e -> performComputation());
		mainPanel.add(computeBtn);

		add(mainPanel);

		setVisible(true);

	}

	public void performComputation() {
		try {
			String vString = velocityText.getText();
			String aString = angleText.getText();

			float velocity = Float.parseFloat(vString);
			float angle = Float.parseFloat(aString);

			System.out.println("Processing: " + velocity + " m/s at " + angle + " degrees");

			// Convert angle to radians
			double angleRad = Math.toRadians(angle);

			// Break velocity into components
			double v0x = velocity * Math.cos(angleRad);  // horizontal component
			double v0y = velocity * Math.sin(angleRad);  // vertical component

			double g = 9.81;  // acceleration due to gravity (m/s²)

			// Step 1: Find time of flight using vertical motion
			double timeOfFlight = (2 * v0y) / g;

			// Step 2: Find range using horizontal motion
			double range = v0x * timeOfFlight;

			System.out.println("Time of Flight: " + timeOfFlight + " seconds");
			System.out.println("Estimated Range: " + range + " meters");

		} catch (NumberFormatException e) {

			System.out.println("Error: Please enter valid numbers.");

		}
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {

				new Projectile_Motion_Calculator();
			}
		});
	}
}