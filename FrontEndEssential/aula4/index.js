async function fetchData() {
    // fetch("http://api.github.com/users/RichardOkubo").then(response => {
    //         console.log(response);
    // });
    const user = document.querySelector('input').value

    var response = await fetch(`http://api.github.com/users/${user}`)

    var data = await response.json();

    document.querySelector('#content').innerHTML = `
        <div>
            <img src="${data.avatar_url}" alt="data.login">
            <h1>${data.name}</h1> 
        <div>    
    `
}