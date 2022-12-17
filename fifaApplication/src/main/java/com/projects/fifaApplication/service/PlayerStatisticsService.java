package com.projects.fifaApplication.service;

import com.projects.fifaApplication.entity.PlayerStats;
import com.projects.fifaApplication.respository.PlayerStatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerStatisticsService implements PlayerStatisticsServiceInterface{

    @Autowired
    private PlayerStatisticsRepository statisticsRepository;

    @Override
    public List<PlayerStats> findAllStats() {
        return statisticsRepository.findAll();
    }

    @Override
    public Optional<PlayerStats> findByStatsId(Long id) {
        return statisticsRepository.findById(id);
    }

    @Override
    public List<PlayerStats> findByGamesPlayed(int games) {
        return statisticsRepository.findByGames(games);
    }

    @Override
    public List<PlayerStats> findByMinutes(int minutes) {
        return null;
    }

    @Override
    public List<PlayerStats> findByGoalScore(int goals) {
        return null;
    }

    @Override
    public List<PlayerStats> findByBirthYear(int birthYear) {
        return null;
    }

    @Override
    public PlayerStats saveStats(PlayerStats player) {
        return null;
    }


}
