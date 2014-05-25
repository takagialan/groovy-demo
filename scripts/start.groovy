#!/usr/bin/env groovy


checkArgs(args)


def checkArgs(args) {
    println args.length
    for (def arg : args) {
        println arg
    }
}

