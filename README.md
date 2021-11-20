# cljs using nodejs minimal example

The most useful thing for using nodejs in cljs is that it provide a repl

## Development
* VS Code + Calva + VSCode Neovim
* shadow-cljs

### Steps:
1. run `shadow-cljs watch app`
2. connect to shadow-cljs in vscode calva using: `Calva: Connect to a running REPL server`, select `shadow-cljs`, then `:app`

3. run `node target/main.js` in another console, and use it as a console output(It is useful when you run)

### How to add npm deps?
Just like normal node app, run `npm install` for your desired package, then require them in the namespace.

### How to add clojure deps?
refer to shadow-cljs.edn#dependencies
please go to the clojurescript official site to see which library are available. The most useful and delight one is `core.async`

## Ref
* https://jiyinyiyong.medium.com/a-beginner-guide-to-compile-clojurescript-with-shadow-cljs-26369190b786
* https://clojurescript.org/about/differences
* https://github.com/thheller/shadow-cljs 
* https://cljs.info/cheatsheet/