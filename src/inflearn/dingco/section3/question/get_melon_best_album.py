def sort_practice():
    my_list = [("현준", 188), ("영호", 170), ("영수", 198)]
    sorted_my_list = sorted(my_list, key=lambda item: item[1], reverse=True)
    print(my_list)
    print(sorted_my_list)


# sort_practice()


def get_melon_best_album(genre_array, play_array):
    # 1. dict에 장르별로 얼마나 재생횟수를 가지고 있는가
    # 2. dict에 장르별로 어느 인덱스에 몇 번 재생횟수를 가지고 있는가
    n = len(genre_array)
    genre_total_play_dict = {}
    genre_index_play_array_dict = {}

    for i in range(n):
        genre = genre_array[i]  # classic
        play = play_array[i]  # 500

        if genre in genre_total_play_dict:  # classic이라는 key가 있으면
            genre_total_play_dict[genre] += play
            genre_index_play_array_dict[genre].append([i, play])
        else:
            genre_total_play_dict[genre] = play
            genre_index_play_array_dict[genre] = [[i, play]]

    # print("genre_total_play_dict", genre_total_play_dict)
    # print("genre_index_play_array_dict", genre_index_play_array_dict)

    # 장르별로 가장 재생횟수가 많은 장르들 중, 곡수가 많은 순서대로 2개씩 출력하기
    # print(genre_total_play_dict.items())

    sorted_genre_play_array = sorted(genre_total_play_dict.items(), key=lambda item: item[1], reverse=True)

    result = []
    for genre, total_play in sorted_genre_play_array:
        # print(genre, total_play)
        # print("genre_index_play_array_dict[genre] is", genre_index_play_array_dict[genre])
        sorted_genre_index_play_array = sorted(genre_index_play_array_dict[genre],
                                               key=lambda item: item[1],
                                               reverse=True)
        # print("sorted_genre_index_play_array is ", sorted_genre_index_play_array)
        genre_song_count = 0
        for index, play in sorted_genre_index_play_array:
            if genre_song_count >= 2:
                break
            # print(f'index={index}, play={play}')
            result.append(index)
            genre_song_count += 1
        # print('result', result)
    return result


print("정답 = [4, 1, 3, 0] / 현재 풀이 값 = ", get_melon_best_album(
    ["classic", "pop", "classic", "classic", "pop"],
    [500, 600, 150, 800, 2500])
      )
print("정답 = [0, 6, 5, 2, 4, 1] / 현재 풀이 값 = ", get_melon_best_album(
    ["hiphop", "classic", "pop", "classic", "classic", "pop", "hiphop"],
    [2000, 500, 600, 150, 800, 2500, 2000]))
