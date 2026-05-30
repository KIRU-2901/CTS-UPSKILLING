function submitRegistration() {
    setTimeout(() => {
        fetch(
            "https://jsonplaceholder.typicode.com/posts",
            {
                method: "POST",
                body: JSON.stringify({
                    name: "Vizhi"
                }),
                headers: {
                    "Content-Type":
                    "application/json"
                }
            }
        )
        .then(response =>
            response.json()
        )
        .then(data =>
            console.log(data)
        )
        .catch(error =>
            console.log(error)
        );
    }, 2000);
}
submitRegistration();
