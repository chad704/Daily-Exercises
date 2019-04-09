const player1 = "Player 1";
const player2 = "Player 2";
var p1wins = '0';
var p2wins = '0';
var p1weapon = null;
var p2weapon = null;
var weapons = ["rock", "paper", "scissors"];



while (p1wins < 1 && p2wins < 1) {
    p1weapon = prompt("Choose one: Rock, Paper, or Scissors.").toLowerCase();
    console.log(player1 + ": " + p1weapon);
    p2weapon = weapons[Math.floor(Math.random() * weapons.length)];
    console.log(player2 + ": " + p2weapon);

    if (p1weapon === p2weapon) {
        alert("It's a Draw! \n" +
            player1 + " has won " + p1wins + " round(s).\n"
            + player2 + " has won " + p2wins + " round(s).");
            winner = "It's a Draw!";
    }
    else if (p1weapon == "rock" && p2weapon == "scissors" || p1weapon == "scissors" && p2weapon == "paper" || p1weapon == "paper" && p2weapon == "rock") {
        p1wins++;
        alert(player1 + " has won " + p1wins + " round(s).\n"
            + player2 + " has won " + p2wins + " round(s).");
            winner = "Player 1 is the winner!";
    }
    else if (p2weapon == "rock" && p1weapon == "scissors" || p2weapon == "scissors" && p1weapon == "paper" || p2weapon == "paper" && p1weapon == "rock") {
        p2wins++;
        alert(player2 + " has won " + p2wins + " round(s).\n"
            + player1 + " has won " + p1wins + " round(s).");
            winner = "Player 2 is the winner!";
    }
    
}
document.getElementById("winner").innerHTML = winner;

