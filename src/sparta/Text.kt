package sparta

fun main() {
    val worldName = "스코월드"

    var myName = inputMyInfo("name").toString()

    var myAge = inputMyInfo("age").toString().toInt()

    var myJob = inputMyInfo("job").toString()

    var myGender = inputMyInfo("gender").toString()

    var myMoney = inputMyInfo("money").toString().toInt()

    var myHp = inputMyInfo("hp").toString().toInt()
    var myMp = 0

    var isNamePass = true
    var isAgePass = true
    var isJobPass = true

    var names = arrayOf("참새", "꿩", "비둘기")
    isNamePass = nameValidationCheck(names, myName, isNamePass)

    isAgePass = ageValidationCheck(myAge, isAgePass)

    isJobPass = jobValidationCheck(myJob, isJobPass)

    // 모든 조건을 통과한 경우에만 환영
    if (canAccessGame(isNamePass, isAgePass, isJobPass)) {
        displayInfo(worldName, myName, myAge, myJob)

        if (myJob == "마법사") {
            println("마법사는 초기 mp도 입력해주세요")
            myMp = readln().toInt()
            var myCharacter = Wizard(myName, myAge, myGender, myMoney, myHp, myMp)

            println("던전을 선택해주세요")
            println("[1] 슬라임 동굴, [2] 좀비마을")
            var selectedWorld = readln().toInt()
            selectWorldByWizard(selectedWorld, myCharacter)
        } else if (myJob == "궁수") {
            println("궁수를 선택했군요")
            var myCharacter = Archer(myName, myAge, myGender, myMoney, myHp)

            println("던전을 선택해주세요")
            println("[1] 슬라임 동굴, [2] 좀비마을")
            var selectWorld = readln().toInt()
            selectWorldByArcher(selectWorld, myCharacter)
        }
    }
}

private fun jobValidationCheck(myJob: String, isJobPass: Boolean): Boolean {
    var isJobPass1 = isJobPass
    if (myJob == "전사") {
        println("일시적으로 전사를 이용할 수 없습니다.")
        isJobPass1 = false
    }
    return isJobPass1
}

private fun ageValidationCheck(myAge: Int, isAgePass: Boolean): Boolean {
    var isAgePass1 = isAgePass
    if (myAge < 12) {
        println("12세 미만은 이용할 수 없습니다.")
        isAgePass1 = false
    }
    return isAgePass1
}

private fun nameValidationCheck(names: Array<String>, myName: String, isNamePass: Boolean): Boolean {
    var isNamePass1 = isNamePass
    for (name in names) {
        if (myName == name) {
            println("중복된 이름이 존재합니다.")
            isNamePass1 = false
            break
        }
    }
    return isNamePass1
}

private fun canAccessGame(isNamePass: Boolean, isAgePass: Boolean, isJobPass: Boolean) =
    isNamePass && isAgePass && isJobPass

private fun displayInfo(worldName: String, myName: String, myAge: Int, myJob: String) {
    println("=====================${worldName}에 오신 것을 환영합니다.=================")
    println("당신의 정보는 다음과 같습니다.")
    println("이름: ${myName}")
    println("나이: ${myAge}")
    println("직업: ${myJob}")
    println("모험을 떠나 볼까요?")
}

fun selectWorldByWizard(selectedWorld: Int, myCharacter: Wizard) {
    if (selectedWorld == 1) {
        var slime1 = Slime("초록슬라임", "초록", 30.2, 200, 10)
        slime1.attack()
        myCharacter.attack()

        slime1.poison()
    } else if (selectedWorld == 2) {
        var zombie1 = Zombie("파랑좀비", "파랑", 142.2, 500, 25)
        zombie1.virus()
        myCharacter.fireBall()
    }

}

fun selectWorldByArcher(selectWorld: Int, myCharacter: Archer) {
    if (selectWorld == 1) { // 슬라임 던전
        var slime1 = Slime("파랑 슬라임", "파랑", 30.2, 200, 10)
        slime1.attack()
        myCharacter.windArrow()

        slime1.poison()

    } else if (selectWorld == 2) { // 좀비 던전
        var zombie1 = Zombie("파랑좀비", "파랑", 142.2, 500, 25)
        zombie1.virus()
        myCharacter.windJump("건물1")
    }

}

fun inputMyInfo(type: String): Any? {
    return when (type) {
        "name" -> {
            println("이름을 입력해주세요")
            while (true) {
                try {
                    var originName = readlnOrNull()
                    if (originName?.first() != '_'
                        && originName?.first() != '!'
                    ) {
                        return originName
                    } else {
                        println("이름을 다시 입력해주세요")
                    }
                } catch (e: Exception) {
                    println("이름을 다시 입력해주세요")
                }
            }
        }

        "age" -> {
            println("나이를 입력해주세요")
            while (true) {
                try {
                    var originAge: String? = readlnOrNull()
                    return originAge?.toInt() ?: -1
                } catch (e: Exception) {
                    println("나이를 다시 입력해주세요")
                }
            }
        }

        "job" -> {
            println("직업을 입력해주세요")
            while (true) {
                try {
                    var originJob = readlnOrNull()
                    if (originJob?.equals("궁수") == true || originJob.equals("마법사")) {
                        return originJob
                    } else {
                        println("직업을 다시 입력해주세요")
                    }
                } catch (e: Exception) {
                    println("직업을 다시 입력해주세요")
                }
            }
        }

        "gender" -> {
            println("성별을 입력해주세요")
            while (true) {
                try {
                    var originGender = readlnOrNull()
                    if (originGender?.equals("남") == true || originGender?.equals("여") == true) {
                        return originGender
                    } else {
                        println("성별을 다시 입력해주세요")
                    }
                } catch (e: Exception) {
                    println("성별을 다시 입력해주세요")
                }
            }
        }

        "money" -> {
            println("초기자본을 입력해주세요")
            while (true) {
                try {
                    var originMoney: String? = readlnOrNull()
                    return originMoney?.toInt() ?: -1
                } catch (e: Exception) {
                    println("초기자본을 다시 입력해주세요")
                }
            }
        }

        "hp" -> {
            println("초기체력을 입력해주세요")
            while (true) {
                try {
                    var originHp: String? = readlnOrNull()
                    return originHp?.toInt() ?: -1
                } catch (e: Exception) {
                    println("초기체력을 다시 입력해주세요")
                }
            }
        }

        "mp" -> {
            println("초기마나를 입력해주세요")
            while (true) {
                try {
                    var originMp: String? = readlnOrNull()
                    return originMp?.toInt() ?: -1
                } catch (e: Exception) {
                    println("초기마나를 다시 입력해주세요")
                }
            }
        }

        "selectWorld" -> {
            println("월드를 선택해주세요")
            while (true) {
                try {
                    var selectWorld: String? = readlnOrNull()
                    return selectWorld?.toInt() ?: -1
                } catch (e: Exception) {
                    println("월드를 다시 선택해주세요")
                }
            }
        }

        else -> {
            return "no"
        }
    }
}
