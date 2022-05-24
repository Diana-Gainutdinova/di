theme: /

    state: Echo
        event!: noMatch
        a: Вы сказали: {{$parseTree.text}}

    state:
        event!: match
        a: {{$context.intent.answer}}