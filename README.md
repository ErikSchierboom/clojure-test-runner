# Exercism Clojure test runner

## Installation

Download from https://github.com/exercism/clojure-test-runner.

## Usage

Run the project directly:

    $ clojure -m exercism.clojure-test-runner

Run the project's tests (they'll fail until you edit them):

    $ clojure -A:test:runner

Build an uberjar:

    $ clojure -A:uberjar

Run that uberjar:

    $ java -jar clojure-test-runner.jar

## The Interface

The interface that test runners must conform to is defined in [docs/interface.md](docs/interface.md).

## Copyright

All content in this repository is copyright to Exercism and licenced under MIT.
