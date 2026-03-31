rock = '''
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
'''

paper = '''
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)
'''

scissors = '''
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
'''

#Write your code below this line 👇
import random
choice = [rock,paper,scissors]
user = int(input("What do you choose? Type 0 for Rock, 1 for Paper or 2 for Scissors. "))
if user<=-1 or user>=3:
  print("You typed an invalid number... You Lose !")
else:
  player = choice[user]
  rn = random.randint(0,2)
  bot = choice[rn]
  if player == rock and bot == paper:
    print(f"player \n {player} \n bot \n {bot} \n You Lose !")
  elif player == rock and bot == scissors:
    print(f"player \n {player} \n bot \n {bot} \n You win !")
  elif player ==rock  and bot == rock:
    print(f"player \n {player} \n bot \n {bot} \n draw !")
  elif player == paper and bot == scissors:
    print(f"player \n {player} \n bot \n {bot} \n You Lose !")
  elif player == paper and bot == rock:
    print(f"player \n {player} \n bot \n {bot} \n You Win !")
  elif player == paper and bot == paper:
    print(f"player \n {player} \n bot \n {bot} \n draw !")
  elif player == scissors and bot == rock:
    print(f"player \n {player} \n bot \n {bot} \n You Lose !")
  elif player == scissors and bot == paper:
    print(f"player \n {player} \n bot \n {bot} \n You Win !")
  elif player == scissors and bot == scissors:
    print(f"player \n {player} \n bot \n {bot} \n draw !")
