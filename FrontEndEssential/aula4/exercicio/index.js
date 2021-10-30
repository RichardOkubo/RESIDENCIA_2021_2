async function fetchData() {
    const user = document.querySelector('input').value

    const response = await fetch(`http://api.github.com/users/${user}/repos`)

    const repos = await response.json()

    repos.map((repo) => {

        const li = document.createElement('li')
        li.textContent = repo.full_name

        document.querySelector('#repos').append(li)
    })
}