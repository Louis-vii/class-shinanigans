import numpy as np
import matplotlib.pyplot as plt

# Define the polynomial function
def f(x):
    return x**3 - 4*x**2 + x + 6

# Generate x values
x = np.linspace(-2, 5, 400)
y = f(x)

# Plot the function
plt.figure(figsize=(8, 5))
plt.plot(x, y, label="f(x) = x³ - 4x² + x + 6", color="blue")
plt.axhline(0, color='black', linewidth=0.8)
plt.axvline(0, color='black', linewidth=0.8)

# Mark the intercepts
plt.scatter(0, f(0), color='red', label="y-intercept (0, 6)")
plt.title("Graph of f(x) = x³ - 4x² + x + 6")
plt.xlabel("x")
plt.ylabel("f(x)")
plt.grid(True)
plt.legend()
plt.tight_layout()
plt.show()
