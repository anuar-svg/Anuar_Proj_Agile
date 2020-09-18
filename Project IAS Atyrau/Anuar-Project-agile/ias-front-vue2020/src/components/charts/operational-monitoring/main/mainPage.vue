<template>
    <div class="container">
        <div class="col-12 d-flex flex-wrap">
            <v-card class="col-2" to="social-eco-dev/1">
                <v-card-text style="font-size: .8rem" v-ripple>
                <p class="text--primary"><b>Преступность</b></p>
                <a href="operational-monitoring/1" style="font-size: .7rem;">Всего правонарушений</a>
                </v-card-text>
            </v-card>
            <v-card class="col-2" to="operational-monitoring/2">
                <v-card-text style="font-size: .8rem" v-ripple>
                <p class="text--primary"><b>Мониторинг детельности скорой помощи</b></p>
                <a href="" style="font-size: .7rem;">Количество бригад скорой помощи ССМП</a>
                </v-card-text>
            </v-card>
            <v-card class="col-2" to="operational-monitoring/3">
                <v-card-text style="font-size: .8rem" v-ripple>
                <p class="text--primary"><b>Проишествия</b></p>
                <a href="" style="font-size: .7rem;">Погибло</a>
                </v-card-text>
            </v-card>
            <v-card class="col-2" to="operational-monitoring/4">
                <v-card-text style="font-size: .8rem" v-ripple>
                <p class="text--primary"><b>Мониторинг цен</b> </p>
                <a href="" style="font-size: .7rem;">АИ-92</a>
                </v-card-text>
            </v-card>
        </div>
    </div>
</template>

<style scoped>
    *{
        box-sizing: border-box;
    }
    v-card-text {
        font-size: .8rem;
    }

    a {
        font-size: .7rem;
    }
    
    .col-2 {
        margin: 20px;
    }
</style>