import itertools

# Your list
data = [[5], [1], [0], [8], [1], [8], [0], [3], [2, 3, 4], [3, 4, 5, 6], [2, 3, 4], [6], [3], [6], [4], [0]]

# Flatten the list
flattened_data = [str(item) for sublist in data for item in sublist]

# Generate all possible combinations of 16 characters
combinations = itertools.combinations(flattened_data, 16)

# Convert each combination to a string
keys = [''.join(combination) for combination in combinations]

# Print the keys
for key in keys:
    print(key)