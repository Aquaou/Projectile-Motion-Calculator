# Projectile Motion Calculator

A simple Java Swing application that calculates the range of a projectile given its initial velocity and launch angle.

## Physics

The application uses fundamental kinematic equations:

**Horizontal motion:**
$$x = v_0 \cos(\theta) \cdot t$$

**Vertical motion:**
$$y = v_0 \sin(\theta) \cdot t - \frac{1}{2}gt^2$$

Where:
- $v_0$ = initial velocity (m/s)
- $\theta$ = launch angle (degrees)
- $g = 9.81$ m/s² (acceleration due to gravity)
- $t$ = time (seconds)

## Features

- Clean, dark-themed GUI
- Real-time projectile range calculation
- Input validation with error handling (I should add a JOptionPane for displaying the errors)
- Displays time of flight and maximum range

## How to Run
```bash
javac Projectile_Motion_Calculator.java
java Projectile_Motion_Calculator
```

## Usage

1. Enter the initial velocity in m/s
2. Enter the launch angle in degrees
3. Click "Compute" to calculate the range

## Requirements

- Java 8 or higher
- Swing library (included in standard JDK)
