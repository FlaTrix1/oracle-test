for (let num = 1; num < 100; num++) {
	output = ""

	if (num % 2 == 0) {
		output += "Baz"
	}

	if (num % 5 == 0) {
		output += "inga!"
	}

	console.log(output || num)
}
