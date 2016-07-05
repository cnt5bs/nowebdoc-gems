<!--
csl: ../lib/associacao-brasileira-de-normas-tecnicas-ufmg-face-full.csl
\includecomment{comment}
-->
Introduction
============

@knuth:1984 introduced an appŕoach to programming called *literate programming*: logic explanation interspersed with code chuncks. Years later, @ramsey:1994 designed `noweb`, a simple and extensible tool for literate programming. However, it is difficult to install `noweb` in my academic environment due to the dependencies of several libraries and administrative restrictions. When I decided to search for `noweb` alternatives, I found several good ones, especially: `leo` \[@ream:2001\], `SimpleLit` \[@rock:2013\] and `noweb.py` \[@aquino:2015\]. The first one is too sophisticated for my needs. The second one uses a different markup language for code annotation, but was very suggestive in ideas. The last one contributed with interesting indications for simplifying the document processing.

But I need more than literate programming only! I need a tool that integrates with `pandoc` \[@macfarlane:2006\] and/or the `listings` LaTeX package \[@moses:2006\]: `nowebdoc-gems` was born! I choose to develop `nowebdoc-gems` with [Netbeans](https://netbeans.org/) and [ANTLR4](http://www.antlr.org/).

`nowebdoc-gems` --- Tool
========================

Example
-------

The following file, called `description.md`, contains the description of a logic implemented by the corresponding Java code snippet:

    My Great Tool
    =============
    Logic description of the program with code blocks using
    'pandoc' markers...

    ~~~
    <<Foo.java>>=
    class Foo {
        public static void main( String[] args ) {
            System.out.println( "Code extracted by 'nowebdoc-gems'" );
        }
    }
    ~~~

    Continuation...

Just run the command `nowebdoc-gems -R Foo.java description.md > Foo.java` to extract the snippet `Foo.java` from this description.

Activation Model
----------------

The ultimate goal of this project is to produce a Java application that processes an input literary program with code snippets (noweb/Pandoc format) and extract your code as output:

    nowebdoc-gems -R NowebDocGems.java  noweb-pandoc.md > NowebDocGems.java

In this case, the computational effect produced by the application execution is as follows. From `noweb-pandoc.md` will extract the code called`NowebDocGems.java`.

**Command line** From the command line, the tool offers the following options:

    nowebdoc-gems [--config <CONFIGURATION> | --version | --help] -R <FRAG> <SPECIFICATION>

The `--config` option receives a configuration file as activation argument. The file should contain a pair of code delimiters used in the specification (generally is used `nowebdoc-gems.cfg` as the configuration file) with the following contents:

    # Pandoc code markers:
    code.begin=^\~\~\~.*
    code.end=^\~\~\~

Lines starting with *sharp* are ignored by `--config` command. The last couple of valid delimiters define the corresponding processing values. No consistency checking occurs in processing this file. Many execution errors can be caused if the delimiters are invalid.

Primary Behavior
----------------

The behavioral model tool `nowebdoc-gems` was elaborated in accordance with the *TLA+* ideas proposed by @lamport:2002 and represented in UML \[@uml:2.5\]. An `NowebDocGemSnippets` object determines the characteristic operation of this tool (see the UML state machine diagram showed bellow). In a normal state (*Reading Description*), it is in a condition that indicates that it is not within a block of code. It also has an explicit representation of snippet name inexistent: *inCode* = **false** ∧ *snippetName* = ∅. When it finds a description line that matches the code start pattern, it passes to the code reading state *inCode* = **true**. When the line finally matches the code snippet identification pattern, it enters the state *Reading Snippet Name*. The condition changes to *snippetName* = *n**a**m**e* ∧ *snippetMap*\[*name*\]=∅. The lines that follow are interpreted as lines of a code snippet, unless one of them matches the output code block pattern. Each line of code is added to the snippet list mapped by the *s**n**i**p**p**e**t**N**a**m**e*.

<img src="../../dist/umlet/args-02.png" alt="Tool primary behavior" id="fig:args-02" style="width:80.0%" />

Instalation
===========

The next two scripts are found in the root path of this project. The tool activation command follows:

    <<nowebdoc-gems>>=
    #! /bin/bash
    java -jar /usr/local/lib/nowebdoc-gems/nowebdoc-gems.jar $*

This script installs the tool in `/usr/local/lib` and copies the activation command in `/usr/local/bin`:

    <<install-nowebdoc-gems>>=
    #! /bin/bash
    rm -fR /usr/local/lib/nowebdoc-gems
    mkdir /usr/local/lib/nowebdoc-gems
    cp ../nowebdoc-gems/dist/nowebdoc-gems.jar /usr/local/lib/nowebdoc-gems

    rm -fR /usr/local/lib/nowebdoc-gems/lib
    mkdir /usr/local/lib/nowebdoc-gems/lib
    cp ../nowebdoc-gems/dist/lib/* /usr/local/lib/nowebdoc-gems/lib

    cp ./nowebdoc-gems /usr/local/bin
    chmod u+x /usr/local/bin/nowebdoc-gems

The final step copies a configuration file in the home directory:

    rm -fR ~/cfg/nowebdoc-gems
    mkdir ~/cfg/nowebdoc-gems
    cp ./nowebdoc-gems.cfg ~/cfg/nowebdoc-gems

Bibliography
============

<!--
\setlength{\parindent}{0pt}
-->

