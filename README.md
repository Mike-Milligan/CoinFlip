# CoinFlip Java Application

The **CoinFlip** Java application is a simple utility that simulates flipping a coin for a specified number of times and displays the results. It utilizes the [Picocli](https://picocli.info/) library to handle command-line arguments and provides insights into the outcomes of coin flips.

## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [Examples](#examples)
- [Contributing](#contributing)
- [License](#license)

## Installation

To use the CoinFlip application, you need to have Java installed on your system. You can clone this repository and build the project using [Apache Maven](https://maven.apache.org/).

1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/coinflip.git
   ```
   
2. Navigate to the project directory:
   ```sh
   cd coinflip
   ```
   
3. Build the project using Maven:
   ```sh
   mvn clean install
   ```

## Usage

After building the project, you can run the CoinFlip application from the command line with the following syntax:

```sh
java -jar target/coinflip.jar [OPTIONS]
```

Replace `[OPTIONS]` with any applicable command-line options. The available options are:

- `-f, --flips`: The number of times to flip the coin (default is 1).

## Examples

Here are a few examples of how to use the CoinFlip application:

1. Flip the coin once:
   ```sh
   java -jar target/coinflip.jar -f 1
   ```

2. Flip the coin three times:
   ```sh
   java -jar target/coinflip.jar -f 3
   ```

3. Use the default flip count (1):
   ```sh
   java -jar target/coinflip.jar
   ```

## Contributing

Contributions to the CoinFlip project are welcome! If you encounter any issues or have ideas for improvements, feel free to open an issue or submit a pull request.

## License

The CoinFlip application is distributed under the MIT License. Feel free to use, modify, and distribute the code as per the terms of the license.

---

Feel free to explore, use, and modify the CoinFlip application to suit your needs. Happy coin flipping! 🪙🔀
